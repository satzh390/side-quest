# Interview Playbook

For every side quest, practice explaining the system in this order.

## 1. Clarify the problem

Ask:

- Who are the users?
- What is the main operation?
- What is the expected scale?
- What latency matters?
- What data must be durable?
- What happens if something fails?

## 2. Functional requirements

Keep this to 3–6 important operations.

## 3. NFRs

Choose measurable targets:

- latency
- throughput
- availability
- durability
- consistency
- scalability

## 4. Rough capacity estimation

Practice:

```text
requests/sec
events/day
storage/day
network bandwidth
```

Do not spend 20 minutes making estimates unnecessarily precise.

## 5. High-level architecture

Start simple:

```text
Client
  |
API
  |
Database
```

Then introduce complexity only when a requirement forces it.

## 6. Identify bottlenecks

Ask:

- What becomes hot?
- What becomes a single point of failure?
- What state must be shared?
- What can be cached?
- What can be asynchronous?

## 7. Failure modes

Always discuss:

- duplicate requests
- timeout
- worker crash
- database failure
- queue failure
- network partition
- retry storm

## 8. Consistency

State explicitly:

- strong consistency?
- eventual consistency?
- at-least-once?
- at-most-once?
- idempotent consumer?

## 9. Scaling

Move from:

```text
1 instance
```

to:

```text
10 instances
```

to:

```text
100+ instances
```

and identify what changes.

## 10. Trade-offs

Never finish with only:

> "This is the best architecture."

Instead:

> "I chose X because of requirement Y. The trade-off is Z. If the requirement changes, I would reconsider X."

That is the core habit this repository is intended to develop.
