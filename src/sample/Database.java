package sample;/*
 * StudentGUI
 * Copyright (C) 2017 RapidTheNerd
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.util.ArrayList;
import java.util.HashMap;

public class Database {
    /***
     * To make the code more efficient and clean we can use multiple classes to store and maintain systems such as this.
     * It allows us later on the add and change values in the class without having to go through one class digging for it
     */
    private static HashMap<Integer, ArrayList<String>> students = new HashMap<Integer, ArrayList<String>>();
}
