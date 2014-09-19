package pt.ipb.patterns.creational.factory;

interface DecodedImage {
    String getType();
}

interface ImageReader {
    DecodedImage getDecodedImage();
}

class GifImage implements DecodedImage {
    @Override
    public String getType() {
        return "gif";
    }
}

class JpegImage implements DecodedImage {
    @Override
    public String getType() {
        return "jpeg";
    }
}

class GifReader implements ImageReader {
    @Override
    public DecodedImage getDecodedImage() {
        return new GifImage();
    }
}

class JpegReader implements ImageReader {
    @Override
    public DecodedImage getDecodedImage() {
        return new JpegImage();
    }
}

public class FactoryExanple {
    public static void main(String[] args) {
        ImageReader reader = new GifReader();
        DecodedImage decodedImage = reader.getDecodedImage();
        System.out.println("decodedImage = " + decodedImage.getType());
    }
}
