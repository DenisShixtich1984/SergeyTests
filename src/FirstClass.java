public class FirstClass {

//    Попробовать вывести на экран какое количество раз
//    символ 'a' встречается в данной строке используя метод split:
//    Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method.
//    Решить данную задачу с учетов верхнего и нижнего регистра символа 'a'.


    public static void main(String[] args) {
        String text = "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method.";
        String [] words = text.split("a");
    }


}
