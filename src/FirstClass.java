public class FirstClass {

//    ����������� ������� �� ����� ����� ���������� ���
//    ������ 'a' ����������� � ������ ������ ��������� ����� split:
//    Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method.
//    ������ ������ ������ � ������ �������� � ������� �������� ������� 'a'.


    public static void main(String[] args) {
        String text = "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method.";
        String [] words = text.split("a");
    }


}
