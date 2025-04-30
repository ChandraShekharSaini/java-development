class PrintArray implements Runnable {

    public void run() {
        System.out.println("------" + Thread.currentThread().getName() + "------");
        printArray();
    }

    void printArray() {
        int arr[] = { 1, 2, 3, 4 };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }
}