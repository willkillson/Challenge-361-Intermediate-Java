package com.company;

import java.util.HashMap;

public class Board {
    public HashMap<Character, Position> dictionary;
    public Tile [][]tiles;

    public Board(String alphabet, String text){
        dictionary = CreateDictionary("#_23456789abcdefghijklmnopqrstuvwxyz");



        for(int i = 0;i< 6;i++){
            for(int j = 0;j< 6;j++){
                Tile newTile = new Tile()
            }
        }


    }


    public HashMap<Character, Position> CreateDictionary(String letters){
        HashMap<Character, Position> dic = new HashMap<>();
        int letterIndex = 0;
        for(Integer i = 0;i< 6;i++){
            for(Integer j = 0;j< 6;j++,letterIndex++){
                Position pos = new Position(i,j);
                dic.put(letters.charAt(letterIndex),pos);
            }
        }


        return dic;
    }
}
