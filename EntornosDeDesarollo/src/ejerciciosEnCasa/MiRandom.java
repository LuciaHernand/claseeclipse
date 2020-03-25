package ejerciciosEnCasa;

import java.io.Serializable;
/**
 * 
 *<p> An instance of this class is used to generate a stream of pseudorandom numbers. 
 * The class uses a 48-bit seed, which is modified using a linear congruential formula.
 *(See Donald Knuth, The Art of Computer Programming, Volume 2, Section 3.2.1.)
 *  </p>
 *  <p>
 *If two instances of Random are created with the same seed, and the same sequence of 
 *method calls is made for each, they will generate and return identical sequences of numbers.
 * In order to guarantee this property, particular algorithms are specified for the class Random.
 *  Java implementations must use all the algorithms shown here for the class Random,
 *   for the sake of absolute portability of Java code. However, subclasses of class Random are permitted
 *    to use other algorithms, so long as they adhere to the general contracts for all the methods.
 *</p>
 *<p>
 *The algorithms implemented by class Random use a protected utility method that on each invocation 
 *can supply up to 32 pseudorandomly generated bits.
 *</p>
 *<p>
 *Many applications will find the method Math.random() simpler to use.
 *</p>
 *<p>
 *Instances of java.util.Random are threadsafe. However, the concurrent use of the same java.util.Random
 * instance across threads may encounter contention and consequent poor performance. Consider instead
 *  using ThreadLocalRandom in multithreaded designs.
 *</p>
 *<p>
 *Instances of java.util.Random are not cryptographically secure. Consider instead using SecureRandom
 * to get a cryptographically secure pseudo-random number generator for use by security-sensitive applications.
 *</p> 
 * @author lucia
 * @since
 *1.0

 */

public class MiRandom   extends Object implements Serializable{

	/**
	  *@see
      *Serialized Form
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates a new random number generator.
     *  This constructor sets the seed of the random number generator to a value very likely to be distinct from any other invocation of this constructor.
	 */
 public MiRandom() {}
 /**
  *Creates a new random number generator using a single <code>long seed</code>.
  *The seed is the initial value of the internal state of the pseudorandom number generator which is maintained by method next(int).
<p>
            The invocation new Random(seed) is equivalent to:
</p>
          <code>   Random rnd = new Random();
             rnd.setSeed(seed);</code>

      @param     
                seed - the initial seed
       @see
                setSeed(long)
  *  
  */
 public  MiRandom(long seed) {}
 
 /**
  * <p> Generates the next pseudorandom number.
  * Subclasses should override this, as this is used by 
  * all other methods.</p>
  * <p> 
  * The general contract of <code>next</code> is that it returns 
  * an <code>int</code> value and if the argument bits is between
  * <code> 1</code> and <code>32</code> (inclusive), 
  * then that many low-order bits of the returned value will be (approximately) 
  * independently chosen bit values, each of which is (approximately) equally likely to be <code>0</code> or <code>1</code>.
  *  The method next is implemented by class <code>Random</code> by atomically updating the seed to
  * </p>
  *   <pre> 
  * (seed * 0x5DEECE66DL + 0xBL) & ((1L << 48) - 1)
  *    </pre>
  *    <p>
  *    and returning
  *    </p>
  *  <code> (int)(seed >>> (48 - bits)).</code>
  *   <p>
  *   This is a linear congruential pseudorandom number generator, as defined by D. H. Lehmer and described by Donald E. Knuth in The Art of Computer Programming,
  *   Volume 3: Seminumerical Algorithms, section 3.2.1.      
  * </p>
  * @param 
  * bits - random bits
  * @return 
  * the next pseudorandom value from this random number generator's sequence
  * @since
  *  1.1
  */
 protected int next(int bits) {
	return 0;}
 /**
  * <p>
  * Returns the next pseudorandom, uniformly distributed <code>boolean</code> value 
  * from this random number generator's sequence. The general contract
  *  of <code>nextBoolean</code> is that one <code>boolean</code> value is pseudorandomly 
  *  generated and returned. The values <code>true</code> and <code>false</code> are produced
  *   with (approximately) equal probability. 
  *   </p>
  *   <p>
  * The method <code>nextBoolean</code> is implemented by 
  * class <code>Random</code> as if by:   
  *   </p>
  *   
  *   <code>
  *   <p>
  *   public boolean nextBoolean() {
  *   </p>
  *   <p>
  *   return next(1) != 0;
  *   </p>
  *   <p>}</p>
  *   
  *   </code>
  * @return
  *  the next pseudorandom, uniformly distributed 
  * <code>boolean</code> value from this random number generator's sequence
  * @since 
  * 1.2
  */
 public boolean nextBoolean() {
	return false;}
 /**
  * 
  * <p>
  * Generates random bytes and places them into a user-supplied byte array. The number of random bytes produced is equal to the length of the byte array. 
  * </p>
  * <p>
  * The method <code>nextBytes</code> is implemented by class <code>Random</code>
  *  as if by: 
  * </p>
  * <code>
  * <p>
  * < public void nextBytes(byte[] bytes) {
  * </p>
  * <p>
  * for (int i = 0; i < bytes.length; )
  *  </p>
  *  <p>
  *  for (int rnd = nextInt(), n = Math.min(bytes.length - i, 4);
  *     </p>
  *     <p>
  *       n-- > 0; rnd >>= 8)
  *    </p>
  *    <p>
  *    bytes[i++] = (byte)rnd;
  *	</p>
  *	<p>
  * }
  * </p></code>
  * @param 
  * bytes  - the byte array to fill with random bytes
  * @throws 
  *  NullPointerException - if the byte array is null
  * @since
  *  1.1
  */
 public void nextBytes(byte[] bytes) {}
 /**
  * <p>
  * Returns the next pseudorandom, uniformly distributed <code>double</code> value between <code>0.0</code> and <code>1.0</code> from this random number generator's sequence. 
  * </p>
  * <p>
  * The general contract of <code>nextDouble</code> is that one 
  * <code>double</code> value, chosen (approximately) uniformly
  *  from the range <code>0.0d</code> (inclusive) to <code>1.0d</code> (exclusive),
  *  is pseudorandomly generated and returned. 
  * </p>
  * <p>
  * The method <code>nextDouble</code> is implemented by class <code>Random</code> as if by: 
  * </p>
  * <code>
  * <p>
  * public double nextDouble() {
  * </p>
  * <p>
  * return (((long)next(26) << 27) + next(27))
  *</p>
  *<p>
  *  / (double)(1L << 53);
  * </p>
  * <p> 
  *}
  *</p>
  * </code>
  * <p>
  * The hedge "approximately" is used in the foregoing 
  * description only because the <code>next</code> method is only 
  * approximately an unbiased source of independently 
  * chosen bits. If it were a perfect source of randomly 
  * chosen bits, then the algorithm shown would choose 
  * <code>double</code> values from the stated range with perfect uniformity. 
  * </p>
  * <p>
  * [In early versions of Java, the result was incorrectly calculated as: 
  * </p>
  * <code>
  * <p>
  *  return (((long)next(27) << 27) + next(27))
  * </p>
  * <p>
  * / (double)(1L << 54);
  * </p>
  * <p>
  * This might seem to be equivalent, if not better, but in fact it introduced a large nonuniformity because of the bias in the rounding of floating-point numbers: it was three times as likely that the low-order bit of the significand would be 0 than that it would be 1! This nonuniformity probably doesn't matter much in practice, but we strive for perfection.]
  * </p>
  * @return
  *  the next pseudorandom, uniformly distributed <code>double</code> value between <code>0.0</code> and <code>1.0</code> from this random number generator's sequence
  *@see 
  *Math.random()
  */
 public double nextDouble() {
	return 0;}
 /**
  * <p>
  * Returns the next pseudorandom, uniformly distributed
  *  float value between <code>0.0</code> and <code>1.0</code> from this random number
  *   generator's sequence. 
  * </p>
  * <p>
  * The general contract of <code>nextFloat</code> is that one float value,
  *  chosen (approximately) uniformly from the range 0.0f
  *   (inclusive) to 1.0f (exclusive), is pseudorandomly 
  *   generated and returned. All 224 possible <code>float</code> values 
  *   of the form m x 2-24, where m is a positive integer 
  *   less than 224 , are produced with (approximately) equal 
  *   probability. 
  * </p>
  * <p>
  * The method <code>nextFloat</code> is implemented by class <code>Random</code> as if by: 
  * </p>
  * <code>
  * <p>
  *  public float nextFloat() {
  * </p>
  * <p>
  *  return next(24) / ((float)(1 << 24));
  * </p>
  * <p>}</p>
  * </code>
  * 
  * <p>The hedge "approximately" is used in the foregoing 
  * description only because the next method is only 
  * approximately an unbiased source of independently 
  * chosen bits. If it were a perfect source of randomly
  *  chosen bits, then the algorithm shown would choose
  *   <code>float</code> values from the stated range with
  *    perfect uniformity.
  * </p>
  * <p>
  * [In early versions of Java, the result was incorrectly calculated as: 
  * </p>
  * <code><p> 
  * return next(30) / ((float)(1 << 30));
  * </code></p>
  * <p>
  * This might seem to be equivalent, if not better,
  *  but in fact it introduced a slight nonuniformity 
  *  because of the bias in the rounding of
  *   floating-point numbers: it was slightly more 
  *   likely that the low-order bit of the significand
  *    would be 0 than that it would be 1.]
  * </p>
  * @return 
  * the next pseudorandom, uniformly distributed float value between 0.0 and 1.0 from this random number generator's sequence
  */
  public float nextFloat() {
	return 0;}
  
  /**
   * 
   * <p>
   * Returns the next pseudorandom, Gaussian ("normally") 
   * distributed <code>double</code> value with mean <code>0.0</code> and standard
   *  deviation <code>1.0</code> from this random number generator's
   *   sequence. 
   * 
   * </p>
   * 
   * <p>
   * The general contract of <code>nextGaussian</code> is
   *  that one <code>double</code> value, chosen from 
   *  (approximately) the usual normal distribution 
   *  with mean <code>0.0</code> and standard deviation 
   *  <code>1.0</code>, is pseudorandomly generated and returned. 
   * </p>
   * 
   * <p>
   * The method <code>nextGaussian</code> is implemented by class
   *  <code>Random</code> as if by a threadsafe version of the following:
   * </p>
   * 
   * <code>
   * <p>
   *  private double nextNextGaussian;
   * </p>
   * <p>
   * private boolean haveNextNextGaussian = false;
   * </p>
   * <p>
   * 
   *  public double nextGaussian() {
   * </p>
   * <p>
   * if (haveNextNextGaussian) {
   * </p>
   * <p>
     haveNextNextGaussian = false;
   * </p>
   * <p>
   *  return nextNextGaussian;
   * </p>
   * <p>
   *  } else {
   * </p>
   * <p>
   *  double v1, v2, s;
   * </p>
   * <p>
   *   do {
   * </p>
   * <p>
   *   v1 = 2 * nextDouble() - 1;   // between -1.0 and 1.0
   * </p>
   * <p>
   *    v2 = 2 * nextDouble() - 1;   // between -1.0 and 1.0
   * </p>
   * <p>
   * s = v1 * v1 + v2 * v2;
   * </p>
   * <p>
   *   } while (s >= 1 || s == 0);
   * </p>
   * <p>
   * double multiplier = StrictMath.sqrt(-2 * StrictMath.log(s)/s);
   * </p>
   * <p>
   *  nextNextGaussian = v2 * multiplier;
   * </p>
   * <p>
   *   haveNextNextGaussian = true;
   * </p>
   * <p>
   *  return v1 * multiplier;
   * </p>
   * <p>}</p>
   * <p>}</p>
   * 
   * 
   * </code>
   * <p>
   * This uses the polar method of G. E. P. Box,
   *  M. E. Muller, and G. Marsaglia, as described 
   *  by Donald E. Knuth in The Art of Computer 
   *  Programming, Volume 3: Seminumerical Algorithms,
   *   section 3.4.1, subsection C, algorithm P. Note 
   *   that it generates two independent values at the 
   *   cost of only one call to <code>StrictMath.log</code> and one 
   *   call to <code>StrictMath.sqrt.</code>
   * </p>
   * 
   * 
   * @returnthe
   *  <p>next pseudorandom, Gaussian 
   * ("normally") distributed <code>double value with
   *  mean <code>0.0</code> and standard deviation <code>1.0</code> 
   * from this random number generator's sequence</p>
   */
  public double nextGaussian() {
	return 0;}
/**
 *
 *<p>
 *Returns the next pseudorandom, uniformly distributed 
 *<code>int</code> value from this random number generator's
 * sequence. The general contract of 
 * <code>nextInt</code> is that one <code>int</code> value is pseudorandomly generated and returned. All 232 possible int values are produced with (approximately) equal probability.
 *</p>
 *<p>
 *The method nextInt is implemented by class Random as if by:
 *</p>
 *<code>
 *<p>
 *public int nextInt() {
 * </p>
 *  <p>
 *  return next(32);
 *</p>
 *<p>
 *}
 *</p>
 *</code>
 * @returnthe
 *  next pseudorandom, uniformly distributed <code>int</code> value from this random number generator's sequence
 */
 public int nextInt() {
	return 0;}
 /**
  * <p>
  * Returns a pseudorandom, uniformly distributed <code>int</code>
  *  value between 0 (inclusive) and the specified value (exclusive), drawn from this random number generator's sequence. The general contract of 
  *  <code> nextInt</code> is that one <code>int</code> 
  *   value in the specified range is pseudorandomly generated and returned. All
  *   <code>n</code> possible  <code>int</code>
  *   values are produced with (approximately) equal probability. The method 
  *   <code>nextInt(int n)</code> is implemented by class <code>Random</code>
  *    as if by:
  * </p>
  * <code>
  * <p>
  *  public int nextInt(int n) {
  *  </p>
  *  <p>
  * if (n <= 0)
  *</p>
  *<p>
  * throw new IllegalArgumentException("n must be positive");
  *</p>
  *<p>
  *if ((n & -n) == n)  // i.e., n is a power of 2
  *</p>
  *<p>
  *   return (int)((n * (long)next(31)) >> 31);
  *</p>
  *<p>
  *int bits, val;
  *</p>
  *<p>
  *do {
  *</p>
  *<p> 
  *    bits = next(31);
  *</p>
  *<p>
  *     val = bits % n;
  *</p>
  *<p>
  * } while (bits - val + (n-1) < 0);
  *</p>
  *<p>
  *return val;
  *</p>
  *<p>
  *}
  * </p>
  * </code>
  * <p>
  * The hedge "approximately" is used in the foregoing description only because the next method is only approximately an unbiased source of independently chosen bits. If it were a perfect source of randomly chosen bits, then the algorithm shown would choose
  * <code> int</code> values from the stated range with perfect uniformity. 
  * </p>
  * <p>
  * The algorithm is slightly tricky. It rejects values that would result in an uneven distribution (due to the fact that 2^31 is not divisible by n). The probability of a value being rejected depends on n. The worst case is n=2^30+1, for which the probability of a reject is 1/2, and the expected number of iterations before the loop terminates is 2. 
  * </p>
  * <p>
  * The algorithm treats the case where n is a power of two specially: it returns the correct number of high-order bits from the underlying pseudo-random number generator. In the absence of special treatment, the correct number of low-order bits would be returned. Linear congruential pseudo-random number generators such as the one implemented by this class are known to have short periods in the sequence of values of their low-order bits. Thus, this special case greatly increases the length of the sequence of values returned by successive calls to this method if n is a small power of two.
  * </p>
  * 
  * @param
  *  n - the bound on the random number to be returned. Must be positive.
  * @return 
  * the next pseudorandom, uniformly distributed <code>int</code> value between <code>0</code> (inclusive) and <code>n</code> (exclusive) from this random number generator's sequence
  *@throws
  * IllegalArgumentException - if n is not positive
  *@since
  * 1.2
  */
 public int nextInt(int n) {
	return n;}
 /**
  * <p>
  * Returns the next pseudorandom, uniformly 
  * distributed <code>long</code> value from this random number
  *  generator's sequence. The general contract of
  *   <code>nextLong</code> is that one <code>long</code> value is pseudorandomly
  *    generated and returned. 
  * </p>
  * <p>
  * The method <code>nextLong</code> is implemented by class <code>Random</code> as if by: 
  * </p>
  * <code>
  * <p>
  *  public long nextLong() {
  * </p>
  * <p>
  *  return ((long)next(32) << 32) + next(32);
  * </p>
  * <p>
  * }
  * </p>
  * <p>
  * Because class <code>Random</code> uses a seed with
  *  only 48 bits, this algorithm will not return all
  *   possible <code>long</code> values.
  * </p>
  * 
  * </code>
  * 
  * 
  * @return 
  * the next pseudorandom, uniformly distributed long value from this random number generator's sequence
  */
 public long nextLong() {
	return 0;}
 /**
  * <p>
  * Sets the seed of this random number generator using a single 
  * <code>long seed</code>. The general contract of setSeed is that it alters 
  * the state of this random number generator object so as to be 
  * in exactly the same state as if it had just been created 
  * with the argument <code>seed</code> as a seed. The method setSeed is 
  * implemented by class <code>Random</code> by atomically updating the seed to 
  *</p>
  *<pre>
  *(seed ^ 0x5DEECE66DL) & ((1L << 48) - 1)
  *</pre>
  *<p>
  *and clearing the <code>haveNextNextGaussian</code> flag used by <code>nextGaussian().</code> 
  *</p>
  *<p>
  *The implementation of <code>setSeed</code> by class <code>Random</code> happens to use
  * only 48 bits of the given seed. In general, however, an overriding 
  *method may use all 64 bits of the <code>long</code> argument as a seed value.
  * @param 
  *  seed - the initial seed
  */
 public void setSeed(long seed) { }
 
}
