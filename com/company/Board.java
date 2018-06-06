package com.company;

import java.util.HashMap;

public class Board {
    public HashMap<Character, Position> dictionary;
    public Tile[][] tiles = new Tile[6][6];

    public Position markerPos = new Position(0,0);
    public Position textPos = new Position(0,0);
    public Position targetPos = new Position(0,0);

    public Character targetCharacter;



    public Board(String alphabet, String text){
        dictionary = CreateDictionary("#_23456789abcdefghijklmnopqrstuvwxyz");

        int alphabetKey = 0;
        for(int i = 0;i< 6;i++){
            for(int j = 0;j< 6;j++, alphabetKey++){
                Tile newTile = new Tile( alphabet.charAt(alphabetKey),false);
                tiles[i][j] = newTile;
            }
        }


    }

    public void ShiftRowRight(int rowIndex){

    }
    public void ShiftColumnDown(int columnIndex){

    }

    public Position FindTilePosition(Character chartofind){
        Position pos = new Position(0,0);

        return pos;
    }
    public Character FindTargetCharacter(){
        Character tar = ' ';


        return tar;

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
