//M. Zain
//2022F-BSE-003
//Section A

package randomalphabetthread;

public class RandomAlphabetThread extends Thread {

    public void run() {
        for (int i = 0; i < 26; i++) {
            int randomIndex = (int) (Math.random() * 26);
            char randomChar = (char) ('A' + randomIndex);
            
            System.out.print(randomChar + " ");

            try {
                Thread.sleep((int) (Math.random() * 400) + 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        RandomAlphabetThread thread = new RandomAlphabetThread();
        
        thread.start();
        
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("\nAll characters printed.");
    }
}
