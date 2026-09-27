# 03 — Reliable Webhook Delivery Engine

## Problem

Applications need to deliver events to external HTTP endpoints reliably.

Build a small service that accepts an event and delivers it asynchronously.

## Functional Requirements

1. Register webhook endpoints.
2. Publish events.
3. Deliver asynchronously.
4. Sign requests.
5. Retry failed delivery.
6. Exponential backoff.
7. Dead-letter failed events.
8. Track delivery status.
9. Support replay.

## Architecture

```text
Producer
   |
   v
Webhook API
   |
   v
Queue
   |
   v
Delivery Workers
   |
   v
Customer Endpoint

Failure
   |
   v
Retry Scheduler
   |
   v
DLQ
```

## NFRs

- Producer API should not wait for endpoint delivery.
- Retry must survive worker restart.
- Duplicate delivery must be expected.
- Endpoint timeout must not block a worker indefinitely.
- Delivery metrics must be observable.

## Key Concepts

- asynchronous processing
- at-least-once delivery
- retry
- exponential backoff
- DLQ
- idempotency
- timeout
- backpressure
- worker concurrency
- poison messages

## Important Design Decision

Do not claim exactly-once HTTP delivery.

The realistic contract is:

> At-least-once attempt, with consumers expected to handle duplicate events.

## Scope Limit

Support HTTP only.

No email, SMS, WhatsApp or notification platform.

## Stretch Goal

Implement per-endpoint rate limits and circuit breaking.
