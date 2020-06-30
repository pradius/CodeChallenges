package com.codechallenges.HackerRank.HackTheInterviewVContest;

import java.util.ArrayList;
import java.util.List;

public class NewKeyboard {

    public static String receivedText(String S) {

        List<String> sentences = new ArrayList<>();
        boolean isNumLock = true;
        boolean isHome = false;
        boolean isPrev = false;
        int homeIndex = 0;

        for (int i = 0; i < S.length(); i++) {
            String letter = String.valueOf(S.charAt(i));

            //Check if one of the special keys were triggered
            switch (letter) {
                case "*":
                    if (!sentences.isEmpty()) {
                        if (isHome && isPrev) {
                            sentences.remove(homeIndex - 1);
                            homeIndex--;
                        } else if (!isHome) {
                            sentences.remove(sentences.size() - 1);
                        }
                    }
                    break;
                case "#":
                    isNumLock = isNumLock ? false : true;
                    break;
                case ">":
                    isHome = false;
                    isPrev = false;
                    homeIndex = 0;
                    break;
                case "<":
                    isHome = true;
                    break;
                default:
                    if (isHome) {
                        isPrev = true;
                        for (int j = sentences.size(); j > homeIndex; j--) {
                            sentences.add(j, sentences.get(j - 1));
                            sentences.remove(j - 1);
                        }
                        if (Character.isDigit(S.charAt(i))) {
                            if (isNumLock) {
                                sentences.add(homeIndex, letter);
                                homeIndex++;
                            }
                        } else {
                            sentences.add(homeIndex, letter);
                            homeIndex++;
                        }
                    } else {
                        if (Character.isDigit(S.charAt(i))) {
                            if (isNumLock) {
                                sentences.add(letter);
                            }
                        } else {
                            sentences.add(letter);
                        }
                    }
            }
        }
        return String.join("", sentences);
    }


    public static void main(String[] args) {
        System.out.println("Expected: LLHO  - Actual: " + receivedText("HE*<LL>O"));
        System.out.println("Expected: LLHO  - Actual: " + receivedText("HE*<LT>O"));
        System.out.println("Expected: LLHO22 - Actual: " + receivedText("HE*<LL>O22"));
        System.out.println("Expected: LLHE2O22 - Actual: " + receivedText("HE22*<LL>O22"));
        System.out.println("Expected: L2EO - Actual: " + receivedText("2E2#2*<L*L>O22"));
        System.out.println("Expected: 2ELO - Actual: " + receivedText("<2E2#2*<L*L>O22"));
        System.out.println("Expected:   - Actual: " + receivedText("<<>>**##"));
        System.out.println("Expected:   - Actual: " + receivedText("<<>6>**##"));
        System.out.println("Expected: 6  - Actual: " + receivedText("<<>6>**#6#6"));
        System.out.println("Expected: ii6 - Actual: " + receivedText("<<>i6>**#i6#i6"));
        System.out.println("Expected: 66the  - Actual: " + receivedText("***<<>>66the"));
        System.out.println("Expected: 66the66t66the66the - Actual: " + receivedText("*66the**66the<<66the>>66the"));
        System.out.println("Expected: L2EO - Actual: " + receivedText("2E2 #2* <L* L>O 22"));
        System.out.println("Expected: L2EO - Actual: " + receivedText("HackerRank"));
        System.out.println("Expected: L2EO - Actual: " + receivedText("Today I bought some bread"));
        System.out.println("Expected: L2EO - Actual: " + receivedText("Today <I **bought> **some## bread"));


    }
}
