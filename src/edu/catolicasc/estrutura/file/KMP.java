package edu.catolicasc.estrutura.file;

public class KMP {

    /**
     * Failure array
     **/

    private int[] failure;

    /**
     * Constructor
     **/

    public KMP(String text, String pattern) {

        /** pre construct failure array for a pattern **/

        failure = new int[pattern.length()];

        buildArrayFailure(pattern);

        /** find match **/

        int pos = search(text, pattern);

        if (pos != -1)
            System.out.println("\nMatch found at index " + pos);

    }

    /**
     * Failure function for a pattern
     **/

    private void buildArrayFailure(String pattern) {

        int n = pattern.length();

        failure[0] = -1;

        for (int j = 1; j < n; j++) {

            int i = failure[j - 1];

            while ((pattern.charAt(j) != pattern.charAt(i + 1)) && i >= 0)

                i = failure[i];

            if (pattern.charAt(j) == pattern.charAt(i + 1))

                failure[j] = i + 1;

            else

                failure[j] = -1;

        }

    }

    /**
     * Function to find match for a pattern
     **/

    private int search(String text, String pat) {

        int i = 0, j = 0;

        int lens = text.length();

        int lenp = pat.length();

        while (i < lens && j < lenp) {

            if (text.charAt(i) == pat.charAt(j)) {

                i++;

                j++;

            } else if (j == 0)

                i++;

            else

                j = failure[j - 1] + 1;

        }

        return ((j == lenp) ? (i - lenp) : -1);

    }

}
