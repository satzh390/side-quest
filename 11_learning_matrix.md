# Learning Matrix

| Concept | Projects |
|---|---|
| API design | 1,2,3,4,5,6,7,10 |
| Concurrency | 1,2,6,7 |
| Atomicity | 1,2,6 |
| Idempotency | 2,3,4,7,8 |
| Redis | 1,5,6 |
| PostgreSQL | 2,4,7,8,10 |
| Retry/backoff | 3,4,7 |
| DLQ | 3,4 |
| Queues | 3,4,7,9 |
| Scheduling | 4,7 |
| Leases | 4,6,7 |
| Fencing | 4,6 |
| Caching | 5 |
| Cache invalidation | 5 |
| Distributed coordination | 6,7 |
| DAG/state machines | 7 |
| Kafka | 3,7,8,9 |
| CDC | 8 |
| Backpressure | 3,4,8,9 |
| Ordering | 8,9 |
| Consumer groups | 9 |
| Partitioning | 9,10 |
| Replication | 9,10 |
| Quorum | 10 |
| Eventual consistency | 8,10 |
| Observability | All |
| Fault injection | 3,4,6,8,9,10 |

## Suggested order

1. Rate limiter
2. Idempotency
3. Webhook delivery
4. Delayed job queue
5. Distributed cache
6. Distributed lock
7. Workflow engine
8. CDC
9. Event broker
10. Distributed KV store

## Do not finish all ten before interviewing

After projects 1–4 you already have enough material for many system-design discussions.

Projects 5–7 deepen your understanding.

Projects 8–10 are advanced optional projects.
