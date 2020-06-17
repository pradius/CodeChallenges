package com.codechallenges.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UniqueEmailAddress {
    public static int numUniqueEmails(String[] emails) {
        int count = 0;
        List<String> list = new ArrayList<>();

        for (String email : emails) {
            String end = email.substring(email.indexOf("@"));

            if (email.contains("+")) email = email.substring(0, email.indexOf("+")) + end;
            if (email.substring(0, email.indexOf("@")).contains(".")){
                String newEmail = "";
                for(char letter : email.substring(0, email.indexOf("@")).toCharArray()){
                    if (letter == '.') continue;
                    newEmail += letter;
                }
                email = newEmail + end;
            }

            if (list.contains(email)) {
                continue;
            } else {
                list.add(email);
                count++;
            }
        }
        return count;

        //Functional Code
        /*return (int) Arrays.stream(emails)
                .map(email -> email.substring(0, email.indexOf("@")))
                .filter(email -> email.contains("+"))
                .map(email -> email.substring(0, email.indexOf("+")))
                .filter(email -> !list.contains(email))
                .map(email -> list.add(email))
                .count();
*/

    }

    public static void main(String[] args) {
        String[] emails = {"fg.r.u.uzj+o.pw@kziczvh.com", "r.cyo.g+d.h+b.ja@tgsg.z.com", "fg.r.u.uzj+o.f.d@kziczvh.com", "r.cyo.g+ng.r.iq@tgsg.z.com", "fg.r.u.uzj+lp.k@kziczvh.com", "r.cyo.g+n.h.e+n.g@tgsg.z.com", "fg.r.u.uzj+k+p.j@kziczvh.com", "fg.r.u.uzj+w.y+b@kziczvh.com", "r.cyo.g+x+d.c+f.t@tgsg.z.com", "r.cyo.g+x+t.y.l.i@tgsg.z.com", "r.cyo.g+brxxi@tgsg.z.com", "r.cyo.g+z+dr.k.u@tgsg.z.com", "r.cyo.g+d+l.c.n+g@tgsg.z.com", "fg.r.u.uzj+vq.o@kziczvh.com", "fg.r.u.uzj+uzq@kziczvh.com", "fg.r.u.uzj+mvz@kziczvh.com", "fg.r.u.uzj+taj@kziczvh.com", "fg.r.u.uzj+fek@kziczvh.com"};
        //String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};

        System.out.println(numUniqueEmails(emails));
    }
}
