package io.github.mandar2812.dynaml.kernels

/**
 * Defines a base class for kernels
 * defined on arbitrary objects.
 *
 * @tparam T The domain over which kernel function
 *           k(x, y) is defined. i.e. x,y belong to T
 * @tparam V The type of value returned by the kernel function
 *           k(x,y)
 * */
trait Kernel[T, V] extends Serializable {
  def evaluate(x: T, y: T): V
}














