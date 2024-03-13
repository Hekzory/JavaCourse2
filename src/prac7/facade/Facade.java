package prac7.facade;

public class Facade {
    private AudioSystem audioSystem;
    private Driver driver;
    private ImageSystem imageSystem;

    public Video convert(Video oldVideo) {
        return new Video();
    }

}
