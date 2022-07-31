public class Recursive {

    public static void main(String[] args) {
        recursive(3);
    }

    // stack 방식의 동작 이해
    private static void recursive(int i) {
        if(i ==0) {
            return; // void 형일 때 함수 종료의 의미
        } else {
            recursive(i -1);
            System.out.println(i);
        }
    }

}
