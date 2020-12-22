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
     *  Simply put, the serialVersionUID is a unique identifier for Serializable class.
     *  This is used during the deserialization of an object, to ensure that a loaded class is compatible with teh serialized object.
     *  if no matching class is found, an InvalidClassException is thrown.
     *
     *  Because of this sort of unwanted incompatibility, it's always a good idea to declare a serialVersionUID in Serializable classes.
     *
     *
     */
    private static final long serialVersionUID = 3803934470915584742L;

}
