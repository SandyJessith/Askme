/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Arrays;

/**
 *
 * @author Sandy Jessith Chico
 */
//  public enum level{
//        AMATEUR(1),
//        INTERMEDIATE(2), 
//        ADVANCED(3),
//        SENIOR(4),
//        EXPERT(5);
//        
//                
//    }
public class Category {

    private int categoryId;
    private Question[] questions;
    private static int categoryCounter;
    public static final int MAX_CATEGORIES = 5;

    public Category() {
        this.categoryId = ++Category.categoryCounter;
    }

    public Category(Prize prize, Question[] questions) {
        this.questions = questions;
    }

    public static int getCategoryCounter() {
        return categoryCounter;
    }

    public static void setCategoryCounter(int categoryCounter) {
        Category.categoryCounter = categoryCounter;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Category{idCategory=").append(categoryId);
        sb.append(", questions=").append(questions);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.categoryId;
        hash = 11 * hash + Arrays.deepHashCode(this.questions);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Category other = (Category) obj;
        if (this.categoryId != other.categoryId) {
            return false;
        }
        if (!Arrays.deepEquals(this.questions, other.questions)) {
            return false;
        }
        return true;
    }

}
