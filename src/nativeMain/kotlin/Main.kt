import divideAndConquer.MergeSort
import dynamic.Fibonacci
import dynamic.GridPath
import dynamic.MinimumCoins


fun main(){
    val fib = Fibonacci()
    fib.launch();

    val minimumCoins = MinimumCoins();
    minimumCoins.launch()

    val gridPath = GridPath();
    gridPath.launch();

    val mergeSort = MergeSort();
    mergeSort.launch();

}