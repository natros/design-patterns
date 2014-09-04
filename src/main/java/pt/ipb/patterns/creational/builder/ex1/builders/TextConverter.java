package pt.ipb.patterns.creational.builder.ex1.builders;

/**
 * Abstract builder
 */
public interface TextConverter {
    void convertCharecter(char c);

    void convertParagraph();
}
