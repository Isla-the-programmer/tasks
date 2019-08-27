package com.company;
import java.io.*;
import java.util.*;
public class Main {
    public static class Labyrinth {
        private static List<int[]> intlab = new ArrayList<int[]>();
        private static List<List<int[]>> Graph = new ArrayList<List<int[]>>();
        private static int size = 0;
        private static int width = 0;

        private void setsize(int size){
            this.size = size;
        }
        private void setwidth(int width){
            this.width = width;
        }

        Labyrinth(String[] labyrinth) {
            List<char[]> charlabyrinth = new ArrayList<char[]>();
            for (int i = 0; i < labyrinth.length; i++) {
                charlabyrinth.add(labyrinth[i].toCharArray());
            }
            List<int[]> newlabyrinth = new ArrayList<int[]>();
            for (int i = 0; i < labyrinth.length; i++) {
                int[] sample = new int[charlabyrinth.get(i).length];
                for (int j = 0; j < charlabyrinth.get(i).length; j++) {
                    sample[j] = (int) charlabyrinth.get(i)[j] - ' ';
                }
                newlabyrinth.add(sample);
            }
            setsize(labyrinth.length);
            this.intlab = newlabyrinth;
        setwidth(labyrinth[0].length());
    }

    public List<int[]> getIntlab() {
        return this.intlab;
    }

    public int getsize() {
        return this.size;
    }

        public int getwidth(){
            return this.width;
        }
        public void output() {
            for (int i = 0; i < this.getsize(); i++) {
                for (int j = 0; j < this.getwidth(); j++)
                    System.out.printf("%d", this.getIntlab().get(i)[j]);
                System.out.print("\n");
            }
        }

        public void transform(){
            int size  = this.getsize();
            int width = this.getwidth();
            List<int[]> intlab = this.getIntlab();
            int ind = 0;
            for(int i = 0; i<size;i++){
                for(int j=0;j<width;j++){
                    boolean flag =false;
                    if(intlab.get(i)[j] == 0) {
                        int [] xy = new int[2];
                        xy[0] = i;
                        xy[1] = j;
                        List<int[]> sample = new ArrayList<int[]>();
                        sample.add(xy);
                        this.Graph.add(sample);
                        flag = true;
                    }
                    if (flag){
                        if (((i > 0) && (i < size - 1)) && ((j > 0) && (j < width - 1))) {
                            if (intlab.get(i + 1)[j] == 0) {
                                int []xy1 = new int[2];
                                xy1[0] = i + 1;
                                xy1[1] = j;
                                this.Graph.get(ind).add(xy1);
                            }
                            if (intlab.get(i - 1)[j] == 0) {
                                int []xy1 = new int[2];
                                xy1[0] = i - 1;
                                xy1[1] = j;
                                this.Graph.get(ind).add(xy1);
                            }
                            if (intlab.get(i)[j + 1] == 0) {
                                int []xy1 = new int[2];
                                xy1[0] = i;
                                xy1[1] = j + 1;
                                this.Graph.get(ind).add(xy1);
                            }
                            if (intlab.get(i)[j - 1] == 0) {
                                int []xy1 = new int[2];
                                xy1[0] = i;
                                xy1[1] = j - 1;
                                this.Graph.get(ind).add(xy1);
                            }
                        }
                        if ((i == 0) && (j == 0)) {
                            if (intlab.get(i + 1)[j] == 0) {
                                int []xy1 = new int[2];
                                xy1[0] = i + 1;
                                xy1[1] = j;
                                this.Graph.get(ind).add(xy1);
                            }
                            if (intlab.get(i)[j + 1] == 0) {
                                int []xy1 = new int[2];
                                xy1[0] = i;
                                xy1[1] = j + 1;
                                this.Graph.get(ind).add(xy1);
                            }
                        }
                        if ((i == 0) && (j == width - 1)) {
                            if (intlab.get(i)[j - 1] == 0) {
                                int []xy1 = new int[2];
                                xy1[0] = i;
                                xy1[1] = j - 1;
                                this.Graph.get(ind).add(xy1);
                            }
                            if (intlab.get(i + 1)[j] == 0) {
                                int []xy1 = new int[2];
                                xy1[0] = i + 1;
                                xy1[1] = j;
                                this.Graph.get(ind).add(xy1);
                            }
                        }
                        if ((i == size - 1) && (j == 0)) {
                            if (intlab.get(i - 1)[j] == 0) {
                                int []xy1 = new int[2];
                                xy1[0] = i - 1;
                                xy1[1] = j;
                                this.Graph.get(ind).add(xy1);
                            }
                            if (intlab.get(i)[j + 1] == 0) {
                                int []xy1 = new int[2];
                                xy1[0] = i;
                                xy1[1] = j + 1;
                                this.Graph.get(ind).add(xy1);
                            }
                        }
                        if ((i == size - 1) && (j == width - 1)) {
                            if (intlab.get(i - 1)[j] == 0) {
                                int []xy1 = new int[2];
                                xy1[0] = i - 1;
                                xy1[1] = j;
                                this.Graph.get(ind).add(xy1);
                            }
                            if (intlab.get(i)[j - 1] == 0) {
                                int []xy1 = new int[2];
                                xy1[0] = i;
                                xy1[1] = j - 1;
                                this.Graph.get(ind).add(xy1);
                            }
                        }
                        if ((i == size - 1) && (j == width - 1)) {
                            if (intlab.get(i - 1)[j] == 0) {
                                int []xy1 = new int[2];
                                xy1[0] = i - 1;
                                xy1[1] = j;
                                this.Graph.get(ind).add(xy1);
                            }
                            if (intlab.get(i)[j - 1] == 0) {
                                int []xy1 = new int[2];
                                xy1[0] = i;
                                xy1[1] = j - 1;
                                this.Graph.get(ind).add(xy1);
                            }
                        }
                        if ((i == 0) && ((j > 0) && (j < width - 1))) {
                            if (intlab.get(i)[j + 1] == 0) {
                                int []xy1 = new int[2];
                                xy1[0] = i;
                                xy1[1] = j + 1;
                                this.Graph.get(ind).add(xy1);
                            }
                            if (intlab.get(i)[j - 1] == 0) {
                                int []xy1 = new int[2];
                                xy1[0] = i;
                                xy1[1] = j - 1;
                                this.Graph.get(ind).add(xy1);
                            }
                            if (intlab.get(i + 1)[j] == 0) {
                                int []xy1 = new int[2];
                                xy1[0] = i + 1;
                                xy1[1] = j;
                                this.Graph.get(ind).add(xy1);
                            }
                        }
                        if ((i == size - 1) && ((j > 0) && (j < width - 1))) {
                            if (intlab.get(i)[j + 1] == 0) {
                                int []xy1 = new int[2];
                                xy1[0] = i;
                                xy1[1] = j + 1;
                                this.Graph.get(ind).add(xy1);
                            }
                            if (intlab.get(i)[j - 1] == 0) {
                                int []xy1 = new int[2];
                                xy1[0] = i;
                                xy1[1] = j - 1;
                                this.Graph.get(ind).add(xy1);
                            }
                            if (intlab.get(i - 1)[j] == 0) {
                                int []xy1 = new int[2];
                                xy1[0] = i - 1;
                                xy1[1] = j;
                                this.Graph.get(ind).add(xy1);
                            }
                        }
                        if (((i > 0) && (i < size - 1)) && (j == 0)) {
                            if (intlab.get(i)[j + 1] == 0) {
                                int []xy1 = new int[2];
                                xy1[0] = i;
                                xy1[1] = j + 1;
                                this.Graph.get(ind).add(xy1);
                            }
                            if (intlab.get(i + 1)[j] == 0) {
                                int []xy1 = new int[2];
                                xy1[0] = i + 1;
                                xy1[1] = j;
                                this.Graph.get(ind).add(xy1);
                            }
                            if (intlab.get(i - 1)[j] == 0) {
                                int []xy1 = new int[2];
                                xy1[0] = i - 1;
                                xy1[1] = j;
                                this.Graph.get(ind).add(xy1);
                            }
                        }
                        if (((i > 0) && (i < size - 1)) && (j == width - 1)) {
                            if (intlab.get(i)[j - 1] == 0) {
                                int []xy1 = new int[2];
                                xy1[0] = i;
                                xy1[1] = j - 1;
                                this.Graph.get(ind).add(xy1);
                            }
                            if (intlab.get(i + 1)[j] == 0) {
                                int []xy1 = new int[2];
                                xy1[0] = i + 1;
                                xy1[1] = j;
                                this.Graph.get(ind).add(xy1);
                            }
                            if (intlab.get(i - 1)[j] == 0) {
                                int []xy1 = new int[2];
                                xy1[0] = i - 1;
                                xy1[1] = j;
                                this.Graph.get(ind).add(xy1);
                            }
                        }
                    }
                    if(flag) ind++;
                }
            }
            return;
        }
        public List<List<int[]>> getGraph(){
            return this.Graph;
        }

        public void output1(){
            List<List<int[]>> Graph = getGraph();
            size = Graph.size();
            System.out.print("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
            System.out.print("\n");
            System.out.print("Our graph:\n");
            for(int i =0;i<size;i++){
                width = Graph.get(i).size();
                System.out.printf("[%d,%d]: ",Graph.get(i).get(0)[0],Graph.get(i).get(0)[1]);
                for(int j= 1;j<width-1;j++){
                    System.out.printf("[%d,%d], ",Graph.get(i).get(j)[0],Graph.get(i).get(j)[1]);
                }
                System.out.printf("[%d,%d].\n",Graph.get(i).get(width-1)[0],Graph.get(i).get(width-1)[1]);
            }
            System.out.print("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
            System.out.print("\n");
        }

        int[] dijkstra(int v1, int v2, List<int[]> Graph){
            int size = Graph.size();
            int d[] = new int[size]; // минимальное расстояние
            int u[] = new int[size]; // посещенные вершины
            int p[] = new int[size];
            int[] path = new int[size];
            for (int i = 0; i<size; i++)
            {
                d[i] = 10000;
                u[i] = -1;
                p[i] = -1;
                path[i] = -1;
            }
            d[v1] = 0;
            for(int i =0;i<size; i++){
                int prev = -1;
                for(int j = 0;j<size;j++){
                    if( (u[j] == -1) && (prev == -1 || d[j]<d[prev]) )
                        prev = j;
                }
                if(d[prev] == 10000)
                    break;
                u[prev] = 0;
                for(int j = 1;j<Graph.get(prev).length;j++) {
                    int to = Graph.get(prev)[j];
                    if(d[prev]+1<d[to]){
                        d[to] = d[prev] +1;
                        p[to] = prev;
                    }
                }
            }
            int s = 0;
            for(int i = v2;i != v1;i = p[i]) {
                if(p[i]<0)
                    break;
                path[size-1-s] = i;
                s++;
            }
            return path;
        }


        public List<int[]> path() {
            int[] rows = new int[2];
            rows[0] = 0;
            rows[1] = this.getsize()-1;
            int[] cols = new int[2];
            cols[0] = 0;
            cols[1] = this.getwidth()-1;
            List<int[]> entries = new ArrayList<int[]>();
            for(int el:rows){
                for(int j =0;j<this.getwidth();j++){
                    if(getIntlab().get(el)[j] == 0){
                        int[] xy = new int[2];
                        xy[0] = el;
                        xy[1] = j;
                        entries.add(xy);
                    }
                }
            }
            for(int el:cols){
                for(int i =0;i<this.getsize();i++){
                    if(getIntlab().get(i)[el] == 0){
                        int[] xy = new int[2];
                        xy[0] = i;
                        xy[1] = el;
                        entries.add(xy);
                    }
                }
            }
            List<int[]> Vertixes = new ArrayList<int[]>();
            for(int i =0;i<getGraph().size();i++){
                Vertixes.add(getGraph().get(i).get(0));
            }
            int size =Vertixes.size();
            List<int[]> vers = new ArrayList<int[]>();
            for(int i=0;i< getGraph().size();i++){
                int [] sample = new int[getGraph().get(i).size()];
                int ind = 0;
                for(int[] el:getGraph().get(i)){
                    for(int j = 0;j<size;j++){
                        if( (Vertixes.get(j)[0] == el[0]) && (Vertixes.get(j)[1] == el[1])) {
                            sample[ind] = j;
                            ind++;
                        }
                    }
                }
                vers.add(sample);
            }
            List<List<int[]>> pathes = new ArrayList<List<int[]>>();
            int ind = 0;
            for(int i =0;i<entries.size();i++){
                for(int j =ind;j<entries.size();j++){
                    if(i != j) {
                        int v1 = -1;
                        int v2 = -1;
                        for(int l =0;l<Vertixes.size();l++){
                            if((entries.get(i)[0] == Vertixes.get(l)[0]) && (entries.get(i)[1] == Vertixes.get(l)[1]))
                                v1 = l;
                            if((entries.get(j)[0] == Vertixes.get(l)[0]) && (entries.get(j)[1] == Vertixes.get(l)[1]))
                                v2 = l;
                        }
                        int[] path = dijkstra(v1,v2,vers);
                        List<int[]> path1 = new ArrayList<int[]>();
                        for(int s =0;s < path.length;s++){
                            if(path[s]!= -1)
                                path1.add(Vertixes.get(path[s]));
                        }
                        if(!path1.isEmpty()){
                            path1.add(0,entries.get(i));
                        }
                        if(!path1.isEmpty())
                            pathes.add(path1);
                    }
                }
                ind++;
            }
            if(pathes.isEmpty()) {
                List<int[]> nopath = new ArrayList<int[]>();
                int[] minus = new int[2];
                minus[0] = -1;
                minus[1] = -1;
                nopath.add(minus);
                return nopath;
            }
            int min = pathes.get(0).size();
            List<int[]> minpath= pathes.get(0);
            for(List<int[]> el:pathes){
                if(min > el.size()) {
                    min = el.size();
                    minpath = el;
                }
            }
            return minpath;
        }
        public void result(List<int[]> path){
            List<int[]> intlab = getIntlab();
            for(int i = 0;i<intlab.size();i++)
                for(int j =0;j<intlab.get(i).length;j++){
                    intlab.get(i)[j] += ' ';
                }
            for(int i =0;i<path.size()-1;i++)
                intlab.get(path.get(i)[0])[path.get(i)[1]] = '*';
            int ind = path.size()-1;
            intlab.get(path.get(ind)[0])[path.get(ind)[1]] = '1';
            try(FileWriter writer = new FileWriter("C:\\result.txt", false))//замените выводной файл;
            {
                for(int[] el:intlab) {
                    for (int subel : el)
                        writer.append((char) subel);
                    writer.append('\n');
                }
                writer.flush();
            }
            catch(Exception e){
                System.out.print("gone wrong");
            }
        }
    }
    static String[] input(){
        String line;
        List<String> lines = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\input.txt"));//замените исходный файд;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        catch(Exception e){
            System.out.print("gone wrong");
        }
        //если нужен массив то список можно запросто преобрпзовать
        String [] linesAsArray = lines.toArray(new String[lines.size()]);
        return linesAsArray;
    }

    public static void main(String[] args) {
        String[] labyrinth = input();
        Labyrinth lab = new Labyrinth(labyrinth);
        lab.transform();
        List<int[]> result = lab.path();
        boolean path = true;
        for(int[] i:result){
            if(i[0] == -1) {
                path = false;
                break;
            }
        }
        if(path)
            lab.result(result);
        else
            System.out.print("No path");
    }
}
