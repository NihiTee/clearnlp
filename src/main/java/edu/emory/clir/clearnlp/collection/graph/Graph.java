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
package edu.emory.clir.clearnlp.collection.graph;

import java.util.List;

import edu.emory.clir.clearnlp.util.DSUtils;

/**
 * @author Jinho D. Choi ({@code jinho.choi@emory.edu})
 */
public class Graph
{
	private List<Edge>[] l_outgoingEdges;
	
	@SuppressWarnings("unchecked")
	public Graph(int size)
	{
		l_outgoingEdges = (List<Edge>[])DSUtils.createEmptyListArray(size);
	}

	public void setEdge(int source, int target, double weight)
	{
		l_outgoingEdges[source].add(new Edge(source, target, weight));
	}
	
	public List<Edge> getOutgoingEdges(int source)
	{
		return l_outgoingEdges[source];
	}
	
	public int size()
	{
		return l_outgoingEdges.length;
	}
}