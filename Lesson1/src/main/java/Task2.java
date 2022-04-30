class Task2 {
    public static void main(String[] args) {
        System.out.println("Программа считает количество положительных чисел в исходном наборе");
        boolean isCorrect;
        int amount = 0;
        for (int i = 0; i < args.length; i++) {
            if (Integer.parseInt(args[i]) > 0)
                amount++;
        }
        System.out.println("Количество положительных элементов: "+ amount);
    }
}
