package com.maharshi.stacks;

public class StackChallenge {

    public static void main(String[] args) {
        ArrayCharacterStack stack = new ArrayCharacterStack(10);
        String test = "I did,M did I?";
        test = refineString(test);
        int limit = test.length() / 2;
        if (test.length() % 2 != 0)
            limit++;
        for (int i = 0; i < limit; i++) {
            stack.push(test.charAt(i));
        }
        for (int i = test.length()/2; i < test.length(); i++) {
            if (stack.peek() == test.charAt(i)) {
                stack.pop();
            } else {
                break;
            }
        }
        System.out.println("String is " + (stack.isEmpty() ? "Palindrome" : "not Palindrome"));
        stack.printStack();
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
