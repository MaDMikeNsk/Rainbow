public class Main {

    private static void flipArray(String[] array) {
        if (array.length!=0) {
            for (int i = 0; i < array.length / 2; i++) {
                String temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
        }
    }

    public static void main(String[] args) {
	    String[] rainbow = {"Red","Orange","Yellow","Green","Cyan","Blue","Violet"};

	    for (int i = rainbow.length-1; i>=0; i--){
            System.out.println(rainbow[i]);
        }
        System.out.println("================");
	    flipArray(rainbow);
        for (String item : rainbow){
            System.out.println(item);
        }
    }
}
