package arrayrithmetic;

public class ArrayArithmeticDemo1 {
    /**
     * 定义一个数组类型的变量，使用数组类型“类型[]”，例如，int[]。和单个基本类型变量不同，数组变量初始化必须使用new int[5]表示创建一个可容纳5个int元素的数组。
     * <p>
     * Java的数组有几个特点：
     * <p>
     * 数组所有元素初始化为默认值，整型都是0，浮点型是0.0，布尔型是false；
     * 数组一旦创建后，大小就不可改变。
     * 要访问数组中的某一个元素，需要使用索引。数组索引从0开始，例如，5个元素的数组，索引范围是0~4。
     * <p>
     * 可以修改数组中的某一个元素，使用赋值语句，例如，ns[1] = 79;。
     * <p>
     * 可以用数组变量.length获取数组大小：
     */
    public static void main(String[] args) {
        //    如果我们有一组类型相同的变量，例如，5位同学的成绩，可以这么写：
// 5位同学的成绩:
        int n1 = 68;
        int n2 = 79;
        int n4 = 85;
        int n5 = 62;
        //    但其实没有必要定义5个int变量。可以使用数组来表示“一组”int类型。
// 5位同学的成绩:
        int[] ns = new int[5];
        ns[0] = 68;
        ns[1] = 79;
        ns[2] = 91;
        ns[3] = 85;
        ns[4] = 62;

        System.out.println(ns.length); // 5

//        数组是引用类型，在使用索引访问数组元素时，如果索引超出范围，运行时将报错
        int n = 5;
//        System.out.println(ns[n]); // 索引n不能超出范围
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

//        也可以在定义数组时直接指定初始化的元素，这样就不必写出数组大小，而是由编译器自动推算数组大小。例如
        int[] ns2 = new int[]{68, 79, 91, 85, 62};
        System.out.println(ns2.length); // 编译器自动推算数组大小为5
//        还可以进一步简写为：

        int[] ns3 = {68, 79, 91, 85, 62};

//        注意数组是引用类型，并且数组大小不可变。我们观察下面的代码：
        // 5位同学的成绩:
        int[] ns4;
        ns4 = new int[]{68, 79, 91, 85, 62};
        System.out.println(ns4.length); // 5
        ns4 = new int[]{1, 2, 3};
        System.out.println(ns4.length); // 3

//        数组大小变了吗？看上去好像是变了，但其实根本没变。
//
        //对于数组ns来说，执行ns = new int[] { 68, 79, 91, 85, 62 };时，它指向一个5个元素的数组：
        //
        //     ns
        //      │
        //      ▼
        //┌───┬───┬───┬───┬───┬───┬───┐
        //│   │68 │79 │91 │85 │62 │   │
        //└───┴───┴───┴───┴───┴───┴───┘
        //执行ns = new int[] { 1, 2, 3 };时，它指向一个新的3个元素的数组：
        //
        //     ns ──────────────────────┐
        //                              │
        //                              ▼
        //┌───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐
        //│   │68 │79 │91 │85 │62 │   │ 1 │ 2 │ 3 │   │
        //└───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘
        //但是，原有的5个元素的数组并没有改变，只是无法通过变量ns引用到它们而已


    }


}
