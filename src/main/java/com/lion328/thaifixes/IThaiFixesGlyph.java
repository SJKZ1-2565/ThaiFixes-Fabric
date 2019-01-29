package com.lion328.thaifixes;

public interface IThaiFixesGlyph {
    boolean shouldRemoveAdvance();
    void setRemoveAdvance(boolean flag);
    float getRealAdvance();
    void setThaiFixesFlag(boolean flag);
    boolean getThaiFixesFlag();
    void setCharacter(char c);
    char getCharacter();
}
