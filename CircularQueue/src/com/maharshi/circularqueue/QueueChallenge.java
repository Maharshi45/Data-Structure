package com.maharshi.circularqueue;

public class QueueChallenge {

    public static void main(String[] args) {
        CharacterCircularQueue queue = new CharacterCircularQueue(10);
        String test = "I did,M did I?";
        test = refineString(test);
        for (int i = 0; i < test.length(); i++) {
            queue.add(test.charAt(i));
        }
        for (int i = test.length() - 1; i >= 0; i--) {
            if (test.charAt(i) == queue.peek())
                queue.remove();
            else
                break;
        }
        System.out.println("String is " + (queue.size() == 0 ? "Palindrome" : "not Palindrome"));
        queue.printQueue();
    }

    private static String refineString(String test) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < test.length(); i++) {
            if (Character.isAlphabetic(test.charAt(i))) {
                builder.append(test.charAt(i));
            }
        }
        return builder.toString().toLowerCase();
    }

}
