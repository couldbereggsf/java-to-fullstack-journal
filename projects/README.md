# Projects

Code for Friday all-nighter builds and any standalone practice projects worth preserving.

**Naming convention:** `week-XX-project-name/`
Example: `week-01-conditionals-practice/`, `week-04-05-jvm-optimization/`

## Structure per project
Each project folder should be self-contained:
```
week-01-conditionals-practice/
├── src/
│   └── Main.java
└── README.md   (optional: what the project demonstrates)
```

## Important — keep build output out of Git
Compiled files (`*.class`) and IDE output folders (`out/`, `target/`, `.idea/`) should **never** be committed.
These are already excluded via the root `.gitignore`. Only commit source (`.java`, `.md`, config files).

If a project folder currently has `Main.class` sitting next to `Main.java`, delete the `.class` file before committing —
it gets regenerated automatically whenever the code is compiled or run.
