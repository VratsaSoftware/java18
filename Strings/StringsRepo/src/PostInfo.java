public class PostInfo {

    public static void main(String[] args) {
        String[] post = {"Ivan Ivanov", "Bulgaria", "Vratsa", "Kokiche 14", "3000"};
        printPostInfo(post);
        System.out.println(printFormattedInfo(post));
    }

    //     version 1
    private static void printPostInfo(String[] post) {
        for (int i = 0; i < post.length; i++) {
            System.out.println(post[i]);
        }
    }

    //     version 2
    private static String printFormattedInfo(String[] post) {
        return String.format("%s\n%s\n%s\n%s\n%s",
                post[0], post[1], post[2], post[3], post[4]);
    }
}
