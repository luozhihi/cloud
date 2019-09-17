package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        Match match1 = new Match();
        match1.setData(match1.getNumber8());
        Match match2 = new Match();
        match2.setData(match1.getNumber8());
        Match match3 = new Match();
        match3.setData(match1.getNumber1());
        Match match4 = new Match();

        match4.setData(match1.getNumber6());
        List<Match> list = new ArrayList<>();
        list.add(match1);
        list.add(match2);
        list.add(match3);
        list.add(match4);
        System.out.println(list.get(0).getValue());
        System.out.println(list.get(1).getValue());
        System.out.println(list.get(2).getValue());
        System.out.println(list.get(3).getValue());
        // 减
        for (int i = 0; i < 4; i++) {
            Match match = list.get(i);
            for (int j = 0;j < 7;j++){
                if(match.getData().get(j)){
                    match.getData().set(j,false);
                    if(match.getValue()!=null){
                        System.out.println(list.get(0).getValue());
                        System.out.println(list.get(1).getValue());
                        System.out.println(list.get(2).getValue());
                        System.out.println(list.get(3).getValue());
                        System.out.println("----------------------");
                        // 加
                        for (int k = 0; k < 4; k++) {
                            Match mat = list.get(k);
                            for (int l = 0; l < 7; l++) {
                                if(!mat.getData().get(l)){
                                    mat.getData().set(l,true);
                                    if(mat.getValue()!=null){
                                        Integer x = list.get(0).getValue();
                                        Integer y = list.get(1).getValue();
                                        String str1 = String.valueOf(x*y);
                                        if(str1.equals(list.get(2).getValue().toString()+list.get(3).getValue().toString())){
                                            System.out.println("i:"+i+",j:"+j+",k:"+k+",l:"+l);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        // 加

        // 运算

    }
}
class Match{
    private List<Boolean> data;
    private List<Boolean> number0 = new ArrayList<>();
    private List<Boolean> number1 = new ArrayList<>();
    private List<Boolean> number1_2 = new ArrayList<>();
    private List<Boolean> number2 = new ArrayList<>();
    private List<Boolean> number3 = new ArrayList<>();
    private List<Boolean> number4 = new ArrayList<>();
    private List<Boolean> number5 = new ArrayList<>();
    private List<Boolean> number6 = new ArrayList<>();
    private List<Boolean> number7 = new ArrayList<>();
    private List<Boolean> number8 = new ArrayList<>();
    private List<Boolean> number9 = new ArrayList<>();

    public List<Boolean> getData() {
        return data;
    }

    public void setData(List<Boolean> data) {
        this.data = data;
    }

    public List<Boolean> getNumber0() {
        return number0;
    }

    public void setNumber0(List<Boolean> number0) {
        this.number0 = number0;
    }

    public List<Boolean> getNumber1() {
        return number1;
    }

    public void setNumber1(List<Boolean> number1) {
        this.number1 = number1;
    }

    public List<Boolean> getNumber1_2() {
        return number1_2;
    }

    public void setNumber1_2(List<Boolean> number1_2) {
        this.number1_2 = number1_2;
    }

    public List<Boolean> getNumber2() {
        return number2;
    }

    public void setNumber2(List<Boolean> number2) {
        this.number2 = number2;
    }

    public List<Boolean> getNumber3() {
        return number3;
    }

    public void setNumber3(List<Boolean> number3) {
        this.number3 = number3;
    }

    public List<Boolean> getNumber4() {
        return number4;
    }

    public void setNumber4(List<Boolean> number4) {
        this.number4 = number4;
    }

    public List<Boolean> getNumber5() {
        return number5;
    }

    public void setNumber5(List<Boolean> number5) {
        this.number5 = number5;
    }

    public List<Boolean> getNumber6() {
        return number6;
    }

    public void setNumber6(List<Boolean> number6) {
        this.number6 = number6;
    }

    public List<Boolean> getNumber7() {
        return number7;
    }

    public void setNumber7(List<Boolean> number7) {
        this.number7 = number7;
    }

    public List<Boolean> getNumber8() {
        return number8;
    }

    public void setNumber8(List<Boolean> number8) {
        this.number8 = number8;
    }

    public List<Boolean> getNumber9() {
        return number9;
    }

    public void setNumber9(List<Boolean> number9) {
        this.number9 = number9;
    }

    {
        // init
        setNumber(number0,0,1,4,6,5,2);
        setNumber(number1,1,4);
        setNumber(number1_2,2,5);
        setNumber(number2,0,2,3,4,6);
        setNumber(number3,0,2,3,5,6);
        setNumber(number4,1,3,2,5);
        setNumber(number5,0,1,3,5,6);
        setNumber(number6,0,1,3,4,5,6);
        setNumber(number7,0,2,5);
        setNumber(number8,0,1,2,3,4,5,6);
        setNumber(number9,0,1,2,3,5,6);
    }
    private void setNumber(List<Boolean> number,Integer...params){
        for (int i = 0; i < 7 ; i++) {
            number.add(false);
        }
        for (Integer param:params){
            number.set(param,true);
        }
    }

    public Integer getValue(){
        if(compare(this.data,number0)){
            return 0;
        }
        if(compare(this.data,number1)||compare(this.data,number1_2)){
            return 1;
        }
        if(compare(this.data,number2)){
            return 2;
        }
        if(compare(this.data,number3)){
            return 3;
        }
        if(compare(this.data,number4)){
            return 4;
        }
        if(compare(this.data,number5)){
            return 5;
        }
        if(compare(this.data,number6)){
            return 6;
        }
        if(compare(this.data,number7)){
            return 7;
        }
        if(compare(this.data,number8)){
            return 8;
        }
        if(compare(this.data,number9)){
            return 9;
        }
        return null;
    }

    private boolean compare(List<Boolean> number1,List<Boolean> number2){
        for (int i = 0; i < 7; i++) {
            if(!number1.get(i).equals(number2.get(i))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Match match1 = new Match();
        match1.setData(match1.getNumber8());
        System.out.println(match1.getValue());
    }
}
