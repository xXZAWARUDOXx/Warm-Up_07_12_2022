public class WarmUp {
    public static void main(String[] args) {
        new WarmUp().run();
    }

    public void run() {
        String string = "^vv<^>v";
        char[] chars = string.toCharArray();
        int length = string.length();
        int counterOben = 0;
        int counterUnten = 0;
        int counterLinks = 0;
        int counterRechts = 0;

        for (int i = 0; i < string.length(); i++) {
            switch (string.charAt(i)) {
                case '^' -> counterOben++;
                case 'v' -> counterUnten++;
                case '<' -> counterLinks++;
                case '>' -> counterRechts++;
            }
        }
        if (counterOben > counterUnten && counterOben > counterLinks && counterOben > counterRechts) {
            for (int i = 0; i < length; i++) {
                chars[i] = '^';
            }
            String output = String.valueOf(chars);
            System.out.println(output);
            System.out.println(length - counterOben + " Müssen ersetzt werden");
        } else if (counterUnten > counterOben && counterUnten > counterLinks && counterUnten > counterRechts) {
            for (int i = 0; i < length; i++) {
                chars[i] = 'v';
            }
            String output = String.valueOf(chars);
            System.out.println(output);
            System.out.println(length - counterUnten + " Müssen ersetzt werden");
        } else if (counterLinks > counterRechts && counterLinks > counterUnten && counterLinks > counterOben) {
            for (int i = 0; i < length; i++) {
                chars[i] = '<';
            }
            String output = String.valueOf(chars);
            System.out.println(output);
            System.out.println(length - counterLinks + " Müssen ersetzt werden");
        } else if (counterRechts > counterLinks && counterRechts > counterOben && counterRechts > counterUnten) {
            for (int i = 0; i < length; i++) {
                chars[i] = '>';
            }
            String output = String.valueOf(chars);
            System.out.println(output);
            System.out.println(length - counterRechts + " Müssen ersetzt werden");
        } else {
            System.out.println("Der String ist inkorrekt");
        }
    }
}
