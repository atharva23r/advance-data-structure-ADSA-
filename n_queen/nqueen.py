def solve_n_queens(n: int):
    results = []
    cols = set()
    pos_diag = set()  # (row + col)
    neg_diag = set()  # (row - col)

    board = [["* "] * n for _ in range(n)]

    def backtrack(row: int):
        if row == n:
            results.append(["".join(r) for r in board])
            return

        for col in range(n):
            if col in cols or (row + col) in pos_diag or (row - col) in neg_diag:
                continue

            # Place queen
            cols.add(col)
            pos_diag.add(row + col)
            neg_diag.add(row - col)
            board[row][col] = "Q "

            # Recurse to next row
            backtrack(row + 1)

            # Backtrack state
            cols.remove(col)
            pos_diag.remove(row + col)
            neg_diag.remove(row - col)
            board[row][col] = "* "

    backtrack(0)
    return results

# Example usage for 4 Queens:
solutions = solve_n_queens(4)
print(f"Total solutions for 4-Queens: {len(solutions)}")
for sol in solutions:
    for row in sol:
        print(row)
    print()