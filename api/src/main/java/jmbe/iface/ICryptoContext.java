
package jmbe.iface;

public interface ICryptoContext {

    void process(int[] cipherText);

    void setOffset(int offset);
}
