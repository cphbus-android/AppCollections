package app

import android.app.Activity
import android.os.Bundle
import android.util.Log

class ActivityMain : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //List
        val aList = mutableListOf(10, 20, 30, 40)
        aList.add(2234)
        aList.set(0, 9876)
        aList.remove(1)
        Log.d("DebugCollections", "toString: " + aList.toString())
        Log.d("DebugCollections", "Size: " + aList.size)
        Log.d("DebugCollections", "Get: " + aList.get(0))

        //Map
        val aMap = hashMapOf("foo" to 1, "bar" to 2)
        aMap["new"] = 65656
        aMap["bar"] = 345
        aMap.remove("foo")
        Log.d("DebugCollections", "toString: " + aMap.toString())
        Log.d("DebugCollections", "Size: " + aMap.size)
        Log.d("DebugCollections", "Get: " + aMap.get("bar"))

        //Set
        val aSet = mutableSetOf<String>("Hello", "World")
        aSet.add("Goodbye")
        aSet.remove("Hello")
        Log.d("DebugCollections", "toString: " + aSet.toString())
        Log.d("DebugCollections", "Size: " + aSet.size)
        Log.d("DebugCollections", "Get: " + aSet.elementAt(1))

        //Aggregate operations
        Log.d("DebugCollections", "Any: " + (aList.any { it > 20 }))
        aList.forEach { Log.d("Collections", "forEach: " + it) }
        Log.d("DebugCollections", "Fold: " + aList.fold(11111111) { total, next -> total + next })

        //Filtering operations
        Log.d("DebugCollections", "Drop: " + aList.drop(2))
        Log.d("DebugCollections", "Filter: " + aList.filter { it > 20 && it < 100 })
        Log.d("DebugCollections", "Filter: " + aList.filter { it in 40..5000 })

        //Mapping operations
        Log.d("DebugCollections", "Map: " + aList.map { it * 1000 })

        //Elements operations
        Log.d("DebugCollections", "Contains: " + aList.contains(40))
        Log.d("DebugCollections", "First: " + aList.first())
        Log.d("DebugCollections", "Last: " + aList.last())

        //Generation operations
        Log.d("DebugCollections", "Plus: " + aList + aList)
        Log.d("DebugCollections", "Zip: " + aList.zip(mutableListOf(97, 98, 99)) { it1, it2 -> it1 + it2 })

        //Ordering operations
        aList.sort()
        Log.d("DebugCollections", "Sort: " + aList)
        aList.reverse()
        Log.d("DebugCollections", "Reverse" + aList)
    }
}