package com.company;

public class Tile {
    public char character;
    public Position pos;

   public Tile(char character, Position pos){
       this.character = character;
       this.pos = pos;
   }
    public Tile(char character, int xpos, int ypos){
        this.character = character;
        this.pos.xpos = xpos;
        this.pos.ypos = ypos;
    }

}

