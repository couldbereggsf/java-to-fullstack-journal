Java → Full-Stack Journal

A shared learning log and project repo for our daily Java → Full-Stack discussion program.

**Participants:** Reagan Fwamba & Lucy Njenga

## Program Summary

- **Daily core session:** 4:00–6:00 AM
- **Daily flex session:** 1 hour, scheduled around availability
- **Friday all-nighter:** Real-world project build, running into Saturday morning
- **Full curriculum:** see [`/docs/framework.md`](./docs/framework.md) for the complete phase-by-phase breakdown

## Repo Structure

	java-to-fullstack-journal/
	├── README.md
	├── docs/
	│   └── framework.md           # full program framework (phases, resources)
	├── notes/
	│   ├── phase-1-foundations/
	│   ├── phase-2-jvm/
	│   ├── phase-3-backend/
	│   ├── phase-4-distributed-ops/
	│   └── phase-5-fullstack-ml/
	├── projects/
	│   └── week-XX-project-name/
	├── teach-back-log.md          # running log: date | topic | who taught | gap found
	└── retros/
	    └── week-XX-retro.md

## Daily Workflow

1. Pull latest `main` before the 4 AM session.
2. Create a branch for the day: `git checkout -b day-<date>-<topic>`
3. Commit during the session as you go.
4. At debrief, push your branch and open a PR — even small changes go through review.
5. Quick review by the other person, then merge into `main` before 6:00 AM.
6. Add the day's notes to `notes/phase-X/`.

## Friday Project Night Workflow

1. Branch per task split: `feature/<task-name>`
2. Merge into a shared `friday-project` integration branch as pieces land.
3. End of night: merge `friday-project` → `main`, tag the milestone:
	git tag week-XX-milestone
	git push --tags
4. Write the retro in `retros/week-XX-retro.md`.

## Conventions

- **Commit messages:** `<phase>: <short description>` e.g. `phase1: add Book class with constructors`
- **Branch naming:** `day-YYYY-MM-DD-<topic>` for daily work, `feature/<name>` for project work
- **PR reviews:** even at 2 people, every PR gets at least one comment or approval before merge — this builds the review habit early
- **Teach-back log:** update after every concept deep-dive session, no exceptions — this is how we catch gaps early

## Branch Protection

`main` is protected — no direct pushes. All changes go through a PR with at least 1 approval.
