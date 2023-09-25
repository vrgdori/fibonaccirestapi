package hu.obuda.devops.fibonaccirestapi.service

import org.springframework.stereotype.Service

@Service
class FibonacciService {
    fun fibonacci(n: Int): Int {
        return when (n) {
            1 -> 1
            2 -> 1
            else -> fibonacci(n-1)+fibonacci(n-2)
        }
        // TODO instead of this logic implement fibonacci
    }
}