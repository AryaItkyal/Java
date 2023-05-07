package Assignment_8.Part2;

public class NOMATCHEXCP extends Exception {
        public NOMATCHEXCP(int line, String input) {
            super("Error: Line " + line + ": \"" + input + "\" is not equal to \"India\"");
        }
}

