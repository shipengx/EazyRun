package serialization;

import java.io.Serializable;

public class Person implements Serializable {

    /**
     *  Easiest method : Alt + Enter on
     *  private static final long serialVersionUID = ;
     *  this will automatically generate a serial version UID for you
     *
     *  You'll get a popover that says "Randomly Change serialVersionUID Initializer". Just hit enter, and it'll populate that space with a random long.
     *
     */
    private static final long serialVersionUID = 3803934470915584742L;

}
