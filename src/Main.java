import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        integerPosition();
        System.out.println("Task 2");
        changeArray();
        System.out.println("Task 3");
        bookshelfOperation();
        System.out.println("Task 4");
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(4);
        stack.push(8);
        stack.push(10);
        stack.push(31);
        reverseStack(stack);
        System.out.println(stack);

        System.out.println("Task 5");
        int[] students = {1,1,1,0,0,1}, samsas = {1,0,0,0,1,1};
        System.out.println(canteenAitu(students,samsas));
        int[] studentss = {1,1,0,0}, sandwiches = {0,1,0,1};

        System.out.println("Task 6");
        int[] arr = {10,7,8,5,3,12,2};
        buildMinHeap(arr);
        System.out.println(Arrays.toString(arr));
    }
    //Time O(n+q) loop
     // Space O(n) creating array
    public static void integerPosition(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> matrix= new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            int k = scanner.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < k; j++){
                row.add(scanner.nextInt());
            }
            matrix.add(row);
        }

        int q = scanner.nextInt();

        ArrayList<int[]> queries = new ArrayList<>();
        for (int i = 0; i < q; i++){
            int[] query = new int[2];
            query[0] = scanner.nextInt()-1;
            query[1] = scanner.nextInt()-1;
            queries.add(query);
        }


        for (int i = 0; i < q; i++){
            int[] curque = queries.get(i);
            if (matrix.get(curque[0]).size() < curque[1]+1){
                System.out.println("ERROR!");
            }
            else {
                System.out.println(matrix.get(curque[0]).get(curque[1]));
            }
        }
    }
    //Time O(n^2) loop and insert can be insertion to the beginnig which means shifting all elements
    // Space O(n) creating array
    public static void changeArray(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            arrayList.add(scanner.nextInt());
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            String query = scanner.next();
            if (query.equals("Insert")){
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                arrayList.add(x, y);
            }
            else {
                arrayList.remove(scanner.nextInt());
            }
        }
        for (int elements : arrayList){
            System.out.print(elements + " ");
        }
    }
    //Time O(n) loop
    // Space O(n) creating linked list
    public static void bookshelfOperation(){
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> bookshelf = new LinkedList<>();
        int n = scanner.nextInt();
        int q;
        int val;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            q = scanner.nextInt();
            switch (q) {
                case 1:
                    val = scanner.nextInt();
                    bookshelf.addFirst(val);
                    break;
                case 2:
                    val = scanner.nextInt();
                    bookshelf.addLast(val);
                    break;
                case 3:
                    result.append(bookshelf.removeFirst()).append(" ");
                    break;
                case 4:
                    result.append(bookshelf.removeLast()).append(" ");
                    break;
            }
        }
        System.out.println(result);
    }
    //Time O(n^2) Insert at bottom O(n) n*n=n^2
    // Space O(n) recursion take space
    public static void reverseStack(Stack<Integer> stack){
        if (stack.isEmpty()) return;
        int x = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack,x);
    }
    //Time O(n)
    // Space O(n)
    public static void insertAtBottom(Stack<Integer> stack, int element){
        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }
        int top = stack.pop();
        insertAtBottom(stack, element);
        stack.push(top);
    }
    //Time O(n) loop
    // Space O(1) nothing created
    public static int canteenAitu(int[] students, int[] samsas){
        int n = students.length;
        int count0 = 0, count1 = 0;
        for (int i = 0; i < n; i++) {
            switch (students[i]){
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
            }
        }
        n = samsas.length;
        for (int i = 0; i < n; i++) {
            if (samsas[i] == 0){
                if (count0 == 0) break;
                count0--;
            }
            else{
                if (count1 == 0) break;
                count1--;
            }
        }
        return count0 + count1;
    }
    //Time O(logn)
    // Space O(logn)
    public static void heapify(int[] arr, int n, int i){
        int smallest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if (left < n && arr[left] < arr[smallest]) smallest = left;
        if (right < n && arr[right] < arr[smallest]) smallest = right;

        if (smallest != i){
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            heapify(arr, n, smallest);
        }
    }
    //Time O(n)
    //Space O(logn)
    public static void buildMinHeap(int[] arr){
        int n = arr.length;
        for (int i = n/2-1; i >= 0; i-- ){
            heapify(arr, n, i);
        }
    }
}
