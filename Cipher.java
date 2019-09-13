package csc130.data.cipher;

import java.util.*;
import sun.plugin.javascript.navig.LinkArray;

public class Cipher {

  private String encoded;
  private String decoded;
  private Queue<Integer> encode;
  private Queue<Integer> decode;

  //Constructor
  public Cipher(int[] key) {
    encode = new LinkedList<Integer>();
    decode = new LinkedList<Integer>();
    for (int i = 0; i < key.length; i++) {
      encode.add(key[i]);
      decode.add(key[i]);
    }
  }

  //Encodes the String passed and prints the encoded String.
  public String encode(String phrase) {
    int buffer;
    encoded = "";
    for (int j = 0; j < phrase.length(); j++) {
      buffer = encode.remove();
      encoded += (char) (phrase.charAt(j) + buffer);
      encode.add(buffer);
    }
    return "Encoded phrase: " + encoded;
  }

  //Decodes the String passed and prints the decoded String.
  public String decode(String phrase) {
    int buffer;
    decoded = "";
    for (int j = 0; j < phrase.length(); j++) {
      buffer = decode.remove();
      decoded += (char) (encoded.charAt(j) - buffer);
      decode.add(buffer);
    }
    return "Decoded phrase: " + decoded;
  }
}