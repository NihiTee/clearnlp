/**
 * Copyright 2014, Emory University
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.emory.clir.clearnlp.collection.pair;

import java.io.Serializable;

/**
 * @since 3.0.0
 * @author Jinho D. Choi ({@code jinho.choi@emory.edu})
 */
public class CharCharPair implements Serializable
{
	private static final long serialVersionUID = -2439322004395455224L;

	public char c1;
	public char c2;
	
	public CharCharPair(char c1, char c2)
	{
		set(c1, c2);
	}
	
	public void set(char c1, char c2)
	{
		this.c1 = c1;
		this.c2 = c2;
	}
}