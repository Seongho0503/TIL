function solution(k, tangerine) {
    const counts = {};
    tangerine.forEach(v => counts[v] = (counts[v] ?? 0) + 1);
    const sortedCounts = Object.values(counts).sort((a, b) => a - b);
    
    const restCount = tangerine.length - k;
    let sum = 0;
    let typeCount = Object.keys(counts).length;
    for (const count of sortedCounts) {
        if (sum + count > restCount) {
            break;
        }
        sum += count;
        typeCount--;
    }
    
    return typeCount;
}