package dev.hmmr.challenge.blind75.graph;

import java.util.ArrayList;
import java.util.List;

public class LC0207 {
  public boolean canFinish(int numCourses, int[][] prerequisites) {
    // create an adjacency list to represent the graph
    List<List<Integer>> graph = new ArrayList<>(numCourses);
    for (int i = 0; i < numCourses; i++) {
      graph.add(new ArrayList<>());
    }

    // build the graph
    for (int[] prereq : prerequisites) {
      graph.get(prereq[0]).add(prereq[1]);
    }

    // array to keep track of visited nodes
    // 0: unvisited, 1: visiting, 2: visited
    int[] visited = new int[numCourses];

    // perform DFS on each course
    for (int i = 0; i < numCourses; i++) {
      if (hasCycle(i, graph, visited)) {
        return false;
      }
    }

    return true;
  }

  private boolean hasCycle(int course, List<List<Integer>> graph, int[] visited) {
    // if the course is already being visited, we found a cycle
    if (visited[course] == 1) {
      return true;
    }

    // if the course has been fully visited before, no need to check again
    if (visited[course] == 2) {
      return false;
    }

    // mark the course as being visited
    visited[course] = 1;

    // check all prerequisites of the current course
    for (int prereq : graph.get(course)) {
      if (hasCycle(prereq, graph, visited)) {
        return true;
      }
    }

    // mark the course as fully visited
    visited[course] = 2;

    return false;
  }
}
