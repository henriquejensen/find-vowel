package br.com.main;

public class StreamImpl implements Stream {
    /**
     * Stream.
     */
    private String stream;
    
    /**
     * Índice atual do cursor de leitura.
     */
    private int indexOf = 0;
    
    /**
     * Construtor com o <code>String</code>.
     * 
     * @param stream Stream.
     */
    public StreamImpl(String stream) {
    	this.stream = stream;
    }
    
    /**
     * Retorna próximo caracter do stream.
     */
    public char getNext() {
    	return this.stream.charAt(indexOf++);
    }

    /**
     * Possui mais caracteres a serem lidos.
     */
    public boolean hasNext() {
    	return (this.stream.length() > indexOf);
    }

}
