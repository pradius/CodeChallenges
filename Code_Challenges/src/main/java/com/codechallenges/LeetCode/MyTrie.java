package com.codechallenges.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class MyTrie {
    List<String> trie;

    /** Initialize your data structure here. */
    public MyTrie() {
        trie = new ArrayList<>();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        trie.add(word);
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if(trie.contains(word)){
            return true;
        }
        return false;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        for(String word : trie){
            if(word.contains(prefix)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        MyTrie trie = new MyTrie();

        trie.insert("apple");
        System.out.println("Expected: True - Actual: " + trie.search("apple")); // returns true
        System.out.println("Expected: False - Actual: " + trie.search("app"));   // returns false
        System.out.println("Expected: True - Actual: " + trie.startsWith("app"));    // returns true
        trie.insert("app");
        System.out.println("Expected: True - Actual: " + trie.search("app"));   // returns true

    }
}
