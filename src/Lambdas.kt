import java.util.concurrent.TimeUnit
import java.util.concurrent.locks.Condition
import java.util.concurrent.locks.Lock

fun <T> lock(lock: Lock, body: () -> T): T {
    lock.lock()
    try {
        return body()
    }
    finally {
        lock.unlock()
    }

}

fun body() {}

fun main(args: Array<String>) {
    val lock = object : Lock {
        override fun lock() {}

        override fun tryLock(): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun tryLock(time: Long, unit: TimeUnit?): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun unlock() {}

        override fun lockInterruptibly() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun newCondition(): Condition {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }
    val result = lock(lock, ::body)
    val result2 = lock(lock) {}

    val sum: (x: Int, y: Int) -> Int = { x, y -> x + y }

    val result3 = sum(1, 3)

    val double: (Int) -> Int = { it * 2 }


}
