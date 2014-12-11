/**
 * Copyright (c) 2013-2015  Patrick Nicolas - Scala for Machine Learning - All rights reserved
 *
 * The source code in this file is provided by the author for the sole purpose of illustrating the 
 * concepts and algorithms presented in "Scala for Machine Learning" ISBN: 978-1-783355-874-2 Packt Publishing.
 * Unless required by applicable law or agreed to in writing, software is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * Version 0.97
 */
package org.scalaml.app.chap11

import org.scalaml.app.ScalaMlTest


		/**
		 * <p>Test driver for the techniques described in the Chapter 11 Reinforcement learning<br>
		 * <ul>
		 * 	 <li>QLearning</li>
		 * </ul></p>
		 * @see org.scalaml.app.ScalaMlTest
		 * @author Patrick Nicolas
		 * @since May 28, 2014
		 * @note Scala for Machine Learning Chapter 11 Reinforcement learning
		 */
final class Chap11 extends ScalaMlTest { 
		/**
		 * Name of the chapter the tests are related to
		 */
	val chapter: String = "Chapter 11"
  	 
	test(s"$chapter QLearning reinforcement learning")  {
		evaluate(QLearningEval)
 	}
}

// ------------------------------------  EOF ----------------------------------