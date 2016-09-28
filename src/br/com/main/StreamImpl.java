package br.com.main;

public class StreamImpl implements Stream {

    private String stream;

    private int indexOf = 0;
    

    public StreamImpl(String stream) {
    	this.stream = stream;
    }
    
    /* pega o proximo char da stream*/
    public char getNext() {
    	return this.stream.charAt(indexOf++);
    }

    public boolean hasNext() {
    	return (this.stream.length() > indexOf);
    }

}
