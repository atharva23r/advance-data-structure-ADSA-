class Graph:
    def __init__(self, vertices: int):
        self.V = vertices
        # Adjacency matrix representation
        self.graph = [[0] * vertices for _ in range(vertices)]

    def is_valid(self, v: int, pos: int, path: list) -> bool:
        """Check if vertex v can be added at path[pos]."""
        # Check if vertex v is adjacent to the previously added vertex
        if self.graph[path[pos - 1]][v] == 0:
            return False

        # Check if vertex v has already been included in the path
        if v in path:
            return False

        return True

    def _hamiltonian_cycle_util(self, path: list, pos: int) -> bool:
        # Base case: All vertices are included in the path
        if pos == self.V:
            # Return True if there is an edge from the last vertex to the first vertex
            return self.graph[path[pos - 1]][path[0]] == 1

        # Try different vertices as candidates in the Hamiltonian Cycle
        for v in range(1, self.V):
            if self.is_valid(v, pos, path):
                path[pos] = v

                # Recurse to build the rest of the path
                if self._hamiltonian_cycle_util(path, pos + 1):
                    return True

                # Backtrack if adding vertex v doesn't lead to a solution
                path[pos] = -1

        return False

    def find_hamiltonian_cycle(self):
        path = [-1] * self.V

        # Start at vertex 0 as the first point in the Hamiltonian Cycle
        path[0] = 0

        if not self._hamiltonian_cycle_util(path, 1):
            print("No Hamiltonian Cycle exists for this graph.")
            return None

        # Append the starting vertex at the end to complete the cycle visual
        full_cycle = path + [path[0]]
        print("Hamiltonian Cycle found:", " -> ".join(map(str, full_cycle)))
        return full_cycle


# Example Usage:
if __name__ == "__main__":

    g = Graph(5)
    g.graph = [
        [0, 1, 0, 1, 0],
        [1, 0, 1, 1, 1],
        [0, 1, 0, 0, 1],
        [1, 1, 0, 0, 1],
        [0, 1, 1, 1, 0]
    ]

    g.find_hamiltonian_cycle()