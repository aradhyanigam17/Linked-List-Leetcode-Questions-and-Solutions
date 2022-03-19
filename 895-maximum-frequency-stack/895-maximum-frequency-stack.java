class FreqStack {
	private final Map<Integer, Deque<Integer>> freqToStack = new HashMap<>();
	private final Map<Integer, Integer> numToMaxFreq = new HashMap<>();
	private int maxFreq;

	/**
	 * Constructs an empty frequency stack
	 */
	public FreqStack() {}

	/**
	 * Pushes an integer val onto the top of the stack.
	 *
	 * @param val integer to be pushed
	 */
	public void push(int val) {
		var freq = numToMaxFreq.compute(val, (k, v) -> v == null ? 1 : ++v);
		freqToStack.computeIfAbsent(freq, k -> new ArrayDeque<>())
				   .push(val);
		maxFreq = Math.max(maxFreq, freq);
	}

	/**
	 * Removes and returns the most frequent element in the stack. If there is a tie for the most frequent element,
	 * the element closest to the stack's top is removed and returned.
	 *
	 * @return The most frequent element in the stack
	 */
	public int pop() {
		var stack = freqToStack.get(maxFreq);
		var top = stack.pop();
		numToMaxFreq.compute(top, (k, v) -> --v);
		if (stack.isEmpty())
			maxFreq--;
		return top;
	}
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */