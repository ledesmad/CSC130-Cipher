package csc130.data.cipher;

  public class Test {
    public static void main(String[] args) {
      int[] key = {12, 3, -4, 9, 5, 2, -6};
      String phrase = "The red fox trots quietly at midnight";
      Cipher j = new Cipher(key);
      System.out.println(j.encode(phrase));
      System.out.println(j.decode(phrase));
      phrase = "CSC130";
      System.out.println(j.encode(phrase));
      System.out.println(j.decode(phrase));

    }
}
