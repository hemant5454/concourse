/*
 * This project is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * 
 * This project is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this project. If not, see <http://www.gnu.org/licenses/>.
 */
package com.cinchapi.concourse.cal.result;

import java.util.Set;

import javax.annotation.concurrent.Immutable;

/**
 * A result that contains a set of objects. The implementing class SHOULD NOT
 * implement additional non-static functionality, but should just specify
 * {@code T}.
 * 
 * @author jnelson
 * @param <T>
 *            - the object type contained in the set
 */
@Immutable
public abstract class AbstractSetResult<T> implements Result{

	private final Set<T> results;

	/**
	 * Construct a new instance.
	 * 
	 * @param results
	 */
	protected AbstractSetResult(Set<T> results) {
		this.results = results;
	}

	/**
	 * Return a set view of the results.
	 * 
	 * @return the results
	 */
	public Set<T> getResults() {
		return results; // TODO return a read only copy
	}

}
